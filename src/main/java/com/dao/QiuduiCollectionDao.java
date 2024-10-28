package com.dao;

import com.entity.QiuduiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuduiCollectionView;

/**
 * 球队收藏 Dao 接口
 *
 * @author 
 */
public interface QiuduiCollectionDao extends BaseMapper<QiuduiCollectionEntity> {

   List<QiuduiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
