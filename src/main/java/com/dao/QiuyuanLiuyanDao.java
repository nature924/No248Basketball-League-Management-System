package com.dao;

import com.entity.QiuyuanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuyuanLiuyanView;

/**
 * 球员留言 Dao 接口
 *
 * @author 
 */
public interface QiuyuanLiuyanDao extends BaseMapper<QiuyuanLiuyanEntity> {

   List<QiuyuanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
