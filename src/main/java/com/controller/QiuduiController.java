
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 球队
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/qiudui")
public class QiuduiController {
    private static final Logger logger = LoggerFactory.getLogger(QiuduiController.class);

    private static final String TABLE_NAME = "qiudui";

    @Autowired
    private QiuduiService qiuduiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//篮球资讯
    @Autowired
    private QiuduiCollectionService qiuduiCollectionService;//球队收藏
    @Autowired
    private QiuduiLiuyanService qiuduiLiuyanService;//球队留言
    @Autowired
    private QiuyuanService qiuyuanService;//球员
    @Autowired
    private QiuyuanCollectionService qiuyuanCollectionService;//球员收藏
    @Autowired
    private QiuyuanLiuyanService qiuyuanLiuyanService;//球员留言
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = qiuduiService.queryPage(params);

        //字典表数据转换
        List<QiuduiView> list =(List<QiuduiView>)page.getList();
        for(QiuduiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QiuduiEntity qiudui = qiuduiService.selectById(id);
        if(qiudui !=null){
            //entity转view
            QiuduiView view = new QiuduiView();
            BeanUtils.copyProperties( qiudui , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody QiuduiEntity qiudui, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,qiudui:{}",this.getClass().getName(),qiudui.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<QiuduiEntity> queryWrapper = new EntityWrapper<QiuduiEntity>()
            .eq("qiudui_name", qiudui.getQiuduiName())
            .eq("qiudui_jiaiolian", qiudui.getQiuduiJiaiolian())
            .eq("qiudui_guojia", qiudui.getQiuduiGuojia())
            .eq("qiudui_address", qiudui.getQiuduiAddress())
            .eq("zan_number", qiudui.getZanNumber())
            .eq("cai_number", qiudui.getCaiNumber())
            .eq("chuangjian_time", new SimpleDateFormat("yyyy-MM-dd").format(qiudui.getChuangjianTime()))
            .eq("qiudui_types", qiudui.getQiuduiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiuduiEntity qiuduiEntity = qiuduiService.selectOne(queryWrapper);
        if(qiuduiEntity==null){
            qiudui.setQiuduiClicknum(1);
            qiudui.setInsertTime(new Date());
            qiudui.setCreateTime(new Date());
            qiuduiService.insert(qiudui);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QiuduiEntity qiudui, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,qiudui:{}",this.getClass().getName(),qiudui.toString());
        QiuduiEntity oldQiuduiEntity = qiuduiService.selectById(qiudui.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(qiudui.getQiuduiPhoto()) || "null".equals(qiudui.getQiuduiPhoto())){
                qiudui.setQiuduiPhoto(null);
        }

            qiuduiService.updateById(qiudui);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<QiuduiEntity> oldQiuduiList =qiuduiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        qiuduiService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<QiuduiEntity> qiuduiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            QiuduiEntity qiuduiEntity = new QiuduiEntity();
//                            qiuduiEntity.setQiuduiName(data.get(0));                    //球队名称 要改的
//                            qiuduiEntity.setQiuduiUuidNumber(data.get(0));                    //球队编号 要改的
//                            qiuduiEntity.setQiuduiPhoto("");//详情和图片
//                            qiuduiEntity.setQiuduiJiaiolian(data.get(0));                    //球队主教练 要改的
//                            qiuduiEntity.setQiuduiGuojia(data.get(0));                    //所属国家 要改的
//                            qiuduiEntity.setQiuduiAddress(data.get(0));                    //球队地点 要改的
//                            qiuduiEntity.setZanNumber(Integer.valueOf(data.get(0)));   //赞 要改的
//                            qiuduiEntity.setCaiNumber(Integer.valueOf(data.get(0)));   //踩 要改的
//                            qiuduiEntity.setChuangjianTime(sdf.parse(data.get(0)));          //球队创建时间 要改的
//                            qiuduiEntity.setQiuduiTypes(Integer.valueOf(data.get(0)));   //球队类型 要改的
//                            qiuduiEntity.setQiuduiClicknum(Integer.valueOf(data.get(0)));   //球队热度 要改的
//                            qiuduiEntity.setQiuduiContent("");//详情和图片
//                            qiuduiEntity.setQiuduiRongyuContent("");//详情和图片
//                            qiuduiEntity.setInsertTime(date);//时间
//                            qiuduiEntity.setCreateTime(date);//时间
                            qiuduiList.add(qiuduiEntity);


                            //把要查询是否重复的字段放入map中
                                //球队编号
                                if(seachFields.containsKey("qiuduiUuidNumber")){
                                    List<String> qiuduiUuidNumber = seachFields.get("qiuduiUuidNumber");
                                    qiuduiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> qiuduiUuidNumber = new ArrayList<>();
                                    qiuduiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("qiuduiUuidNumber",qiuduiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //球队编号
                        List<QiuduiEntity> qiuduiEntities_qiuduiUuidNumber = qiuduiService.selectList(new EntityWrapper<QiuduiEntity>().in("qiudui_uuid_number", seachFields.get("qiuduiUuidNumber")));
                        if(qiuduiEntities_qiuduiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(QiuduiEntity s:qiuduiEntities_qiuduiUuidNumber){
                                repeatFields.add(s.getQiuduiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [球队编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        qiuduiService.insertBatch(qiuduiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }



    /**
    * 个性推荐
    */
    @IgnoreAuth
    @RequestMapping("/gexingtuijian")
    public R gexingtuijian(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("gexingtuijian方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        CommonUtil.checkMap(params);
        List<QiuduiView> returnQiuduiViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = qiuduiCollectionService.queryPage(params1);
        List<QiuduiCollectionView> collectionViewsList =(List<QiuduiCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(QiuduiCollectionView collectionView:collectionViewsList){
            Integer qiuduiTypes = collectionView.getQiuduiTypes();
            if(typeMap.containsKey(qiuduiTypes)){
                typeMap.put(qiuduiTypes,typeMap.get(qiuduiTypes)+1);
            }else{
                typeMap.put(qiuduiTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("qiuduiTypes",type);
            PageUtils pageUtils1 = qiuduiService.queryPage(params2);
            List<QiuduiView> qiuduiViewList =(List<QiuduiView>)pageUtils1.getList();
            returnQiuduiViewList.addAll(qiuduiViewList);
            if(returnQiuduiViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = qiuduiService.queryPage(params);
        if(returnQiuduiViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnQiuduiViewList.size();//要添加的数量
            List<QiuduiView> qiuduiViewList =(List<QiuduiView>)page.getList();
            for(QiuduiView qiuduiView:qiuduiViewList){
                Boolean addFlag = true;
                for(QiuduiView returnQiuduiView:returnQiuduiViewList){
                    if(returnQiuduiView.getId().intValue() ==qiuduiView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnQiuduiViewList.add(qiuduiView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnQiuduiViewList = returnQiuduiViewList.subList(0, limit);
        }

        for(QiuduiView c:returnQiuduiViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnQiuduiViewList);
        return R.ok().put("data", page);
    }

    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = qiuduiService.queryPage(params);

        //字典表数据转换
        List<QiuduiView> list =(List<QiuduiView>)page.getList();
        for(QiuduiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QiuduiEntity qiudui = qiuduiService.selectById(id);
            if(qiudui !=null){

                //点击数量加1
                qiudui.setQiuduiClicknum(qiudui.getQiuduiClicknum()+1);
                qiuduiService.updateById(qiudui);

                //entity转view
                QiuduiView view = new QiuduiView();
                BeanUtils.copyProperties( qiudui , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody QiuduiEntity qiudui, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,qiudui:{}",this.getClass().getName(),qiudui.toString());
        Wrapper<QiuduiEntity> queryWrapper = new EntityWrapper<QiuduiEntity>()
            .eq("qiudui_name", qiudui.getQiuduiName())
            .eq("qiudui_uuid_number", qiudui.getQiuduiUuidNumber())
            .eq("qiudui_jiaiolian", qiudui.getQiuduiJiaiolian())
            .eq("qiudui_guojia", qiudui.getQiuduiGuojia())
            .eq("qiudui_address", qiudui.getQiuduiAddress())
            .eq("zan_number", qiudui.getZanNumber())
            .eq("cai_number", qiudui.getCaiNumber())
            .eq("qiudui_types", qiudui.getQiuduiTypes())
            .eq("qiudui_clicknum", qiudui.getQiuduiClicknum())
//            .notIn("qiudui_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiuduiEntity qiuduiEntity = qiuduiService.selectOne(queryWrapper);
        if(qiuduiEntity==null){
                qiudui.setZanNumber(1);
                qiudui.setCaiNumber(1);
            qiudui.setQiuduiClicknum(1);
            qiudui.setInsertTime(new Date());
            qiudui.setCreateTime(new Date());
        qiuduiService.insert(qiudui);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

