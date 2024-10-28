package com.dao;

import com.entity.QiuduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuduiView;

/**
 * 球队 Dao 接口
 *
 * @author 
 */
public interface QiuduiDao extends BaseMapper<QiuduiEntity> {

   List<QiuduiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
