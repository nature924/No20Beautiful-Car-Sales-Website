package com.entity.view;

import com.entity.CheliangxinghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆型号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
@TableName("cheliangxinghao")
public class CheliangxinghaoView  extends CheliangxinghaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangxinghaoView(){
	}
 
 	public CheliangxinghaoView(CheliangxinghaoEntity cheliangxinghaoEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangxinghaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
