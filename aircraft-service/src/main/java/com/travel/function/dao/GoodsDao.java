package com.travel.function.dao;

import com.travel.function.entity.Goods;
import com.travel.function.vo.GoodsVo;

import java.util.List;

public interface GoodsDao {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods record);

     List<GoodsVo> goodsVoList();

    GoodsVo goodsVoByGoodsId(Long goodId);

}