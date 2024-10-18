package com.entity.view;

import com.entity.DiscusscheliangzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆展示评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 11:54:45
 */
@TableName("discusscheliangzhanshi")
public class DiscusscheliangzhanshiView  extends DiscusscheliangzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscheliangzhanshiView(){
	}
 
 	public DiscusscheliangzhanshiView(DiscusscheliangzhanshiEntity discusscheliangzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscheliangzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
