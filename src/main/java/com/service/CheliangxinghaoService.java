package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangxinghaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangxinghaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangxinghaoView;


/**
 * 车辆型号
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CheliangxinghaoService extends IService<CheliangxinghaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangxinghaoVO> selectListVO(Wrapper<CheliangxinghaoEntity> wrapper);
   	
   	CheliangxinghaoVO selectVO(@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);
   	
   	List<CheliangxinghaoView> selectListView(Wrapper<CheliangxinghaoEntity> wrapper);
   	
   	CheliangxinghaoView selectView(@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangxinghaoEntity> wrapper);
   	
}

