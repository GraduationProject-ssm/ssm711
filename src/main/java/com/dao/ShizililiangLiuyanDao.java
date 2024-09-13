package com.dao;

import com.entity.ShizililiangLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizililiangLiuyanView;

/**
 * 师资力量留言 Dao 接口
 *
 * @author 
 */
public interface ShizililiangLiuyanDao extends BaseMapper<ShizililiangLiuyanEntity> {

   List<ShizililiangLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
