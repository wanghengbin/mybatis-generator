package com.wanghb.test.mapper;

import com.wanghb.test.model.Sandbox;
import com.wanghb.test.model.SandboxExample;
import java.util.List;

public interface SandboxMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sandbox record);

    int insertSelective(Sandbox record);

    List<Sandbox> selectByExample(SandboxExample example);

    Sandbox selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sandbox record);

    int updateByPrimaryKey(Sandbox record);
}