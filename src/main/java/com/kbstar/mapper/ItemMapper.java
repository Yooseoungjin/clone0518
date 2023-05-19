package com.kbstar.mapper;

import com.github.pagehelper.Page;
import com.kbstar.dto.Item;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemMapper extends KBMapper<Integer, Item> {

    public Page<List<Item>> gettopcate(Integer top_cate);
    public List<Item> getcateid(Integer cateid);
    Page<Item> getpage() throws Exception;

}
