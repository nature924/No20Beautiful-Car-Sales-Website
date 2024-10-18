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


import com.dao.CheliangxinghaoDao;
import com.entity.CheliangxinghaoEntity;
import com.service.CheliangxinghaoService;
import com.entity.vo.CheliangxinghaoVO;
import com.entity.view.CheliangxinghaoView;

@Service("cheliangxinghaoService")
public class CheliangxinghaoServiceImpl extends ServiceImpl<CheliangxinghaoDao, CheliangxinghaoEntity> implements CheliangxinghaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangxinghaoEntity> page = this.selectPage(
                new Query<CheliangxinghaoEntity>(params).getPage(),
                new EntityWrapper<CheliangxinghaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangxinghaoEntity> wrapper) {
		  Page<CheliangxinghaoView> page =new Query<CheliangxinghaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangxinghaoVO> selectListVO(Wrapper<CheliangxinghaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangxinghaoVO selectVO(Wrapper<CheliangxinghaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangxinghaoView> selectListView(Wrapper<CheliangxinghaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangxinghaoView selectView(Wrapper<CheliangxinghaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
