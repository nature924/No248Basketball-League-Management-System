package com.dao;

import com.entity.QiuduiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuduiLiuyanView;

/**
 * 球队留言 Dao 接口
 *
 * @author 
 */
public interface QiuduiLiuyanDao extends BaseMapper<QiuduiLiuyanEntity> {

   List<QiuduiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
