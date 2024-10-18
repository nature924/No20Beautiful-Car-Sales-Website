package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CheliangzhanshiDao;
import com.entity.CheliangzhanshiEntity;
import com.service.CheliangzhanshiService;
import com.entity.vo.CheliangzhanshiVO;
import com.entity.view.CheliangzhanshiView;

@Service("cheliangzhanshiService")
public class CheliangzhanshiServiceImpl extends ServiceImpl<CheliangzhanshiDao, CheliangzhanshiEntity> implements CheliangzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangzhanshiEntity> page = this.selectPage(
                new Query<CheliangzhanshiEntity>(params).getPage(),
                new EntityWrapper<CheliangzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangzhanshiEntity> wrapper) {
		  Page<CheliangzhanshiView> page =new Query<CheliangzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangzhanshiVO> selectListVO(Wrapper<CheliangzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangzhanshiVO selectVO(Wrapper<CheliangzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangzhanshiView> selectListView(Wrapper<CheliangzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangzhanshiView selectView(Wrapper<CheliangzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
