package com.entity.model;

import com.entity.QiuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 球员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiuyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 球员姓名
     */
    private String qiuyuanName;


    /**
     * 头像
     */
    private String qiuyuanPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身高
     */
    private String qiuyuanShengao;


    /**
     * 体重
     */
    private String qiuyuanTizhong;


    /**
     * 年龄
     */
    private String qiuyuanAge;


    /**
     * 进球数
     */
    private Integer qiuyuanJinqiushu;


    /**
     * 助攻数
     */
    private Integer qiuyuanZhugong;


    /**
     * 获得奖杯
     */
    private Integer qiuyuanJiangbei;


    /**
     * 球员位置
     */
    private Integer qiuyuanTypes;


    /**
     * 所属球队
     */
    private Integer qiuduiId;


    /**
     * 球员详情
     */
    private String qiuyuanContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：球员姓名
	 */
    public String getQiuyuanName() {
        return qiuyuanName;
    }


    /**
	 * 设置：球员姓名
	 */
    public void setQiuyuanName(String qiuyuanName) {
        this.qiuyuanName = qiuyuanName;
    }
    /**
	 * 获取：头像
	 */
    public String getQiuyuanPhoto() {
        return qiuyuanPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setQiuyuanPhoto(String qiuyuanPhoto) {
        this.qiuyuanPhoto = qiuyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身高
	 */
    public String getQiuyuanShengao() {
        return qiuyuanShengao;
    }


    /**
	 * 设置：身高
	 */
    public void setQiuyuanShengao(String qiuyuanShengao) {
        this.qiuyuanShengao = qiuyuanShengao;
    }
    /**
	 * 获取：体重
	 */
    public String getQiuyuanTizhong() {
        return qiuyuanTizhong;
    }


    /**
	 * 设置：体重
	 */
    public void setQiuyuanTizhong(String qiuyuanTizhong) {
        this.qiuyuanTizhong = qiuyuanTizhong;
    }
    /**
	 * 获取：年龄
	 */
    public String getQiuyuanAge() {
        return qiuyuanAge;
    }


    /**
	 * 设置：年龄
	 */
    public void setQiuyuanAge(String qiuyuanAge) {
        this.qiuyuanAge = qiuyuanAge;
    }
    /**
	 * 获取：进球数
	 */
    public Integer getQiuyuanJinqiushu() {
        return qiuyuanJinqiushu;
    }


    /**
	 * 设置：进球数
	 */
    public void setQiuyuanJinqiushu(Integer qiuyuanJinqiushu) {
        this.qiuyuanJinqiushu = qiuyuanJinqiushu;
    }
    /**
	 * 获取：助攻数
	 */
    public Integer getQiuyuanZhugong() {
        return qiuyuanZhugong;
    }


    /**
	 * 设置：助攻数
	 */
    public void setQiuyuanZhugong(Integer qiuyuanZhugong) {
        this.qiuyuanZhugong = qiuyuanZhugong;
    }
    /**
	 * 获取：获得奖杯
	 */
    public Integer getQiuyuanJiangbei() {
        return qiuyuanJiangbei;
    }


    /**
	 * 设置：获得奖杯
	 */
    public void setQiuyuanJiangbei(Integer qiuyuanJiangbei) {
        this.qiuyuanJiangbei = qiuyuanJiangbei;
    }
    /**
	 * 获取：球员位置
	 */
    public Integer getQiuyuanTypes() {
        return qiuyuanTypes;
    }


    /**
	 * 设置：球员位置
	 */
    public void setQiuyuanTypes(Integer qiuyuanTypes) {
        this.qiuyuanTypes = qiuyuanTypes;
    }
    /**
	 * 获取：所属球队
	 */
    public Integer getQiuduiId() {
        return qiuduiId;
    }


    /**
	 * 设置：所属球队
	 */
    public void setQiuduiId(Integer qiuduiId) {
        this.qiuduiId = qiuduiId;
    }
    /**
	 * 获取：球员详情
	 */
    public String getQiuyuanContent() {
        return qiuyuanContent;
    }


    /**
	 * 设置：球员详情
	 */
    public void setQiuyuanContent(String qiuyuanContent) {
        this.qiuyuanContent = qiuyuanContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
