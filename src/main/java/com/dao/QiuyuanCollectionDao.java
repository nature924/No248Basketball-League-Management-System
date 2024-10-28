package com.dao;

import com.entity.QiuyuanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuyuanCollectionView;

/**
 * 球员收藏 Dao 接口
 *
 * @author 
 */
public interface QiuyuanCollectionDao extends BaseMapper<QiuyuanCollectionEntity> {

   List<QiuyuanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
