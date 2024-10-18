package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangzhanshiView;


/**
 * 车辆展示
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CheliangzhanshiService extends IService<CheliangzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangzhanshiVO> selectListVO(Wrapper<CheliangzhanshiEntity> wrapper);
   	
   	CheliangzhanshiVO selectVO(@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);
   	
   	List<CheliangzhanshiView> selectListView(Wrapper<CheliangzhanshiEntity> wrapper);
   	
   	CheliangzhanshiView selectView(@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangzhanshiEntity> wrapper);
   	
}

