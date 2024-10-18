package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 车辆展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
@TableName("cheliangzhanshi")
public class CheliangzhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangzhanshiEntity() {
		
	}
	
	public CheliangzhanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 车辆编号
	 */
					
	private String cheliangbianhao;
	
	/**
	 * 车辆品牌
	 */
					
	private String cheliangpinpai;
	
	/**
	 * 车辆型号
	 */
					
	private String cheliangxinghao;
	
	/**
	 * 颜色
	 */
					
	private String yanse;
	
	/**
	 * 换挡方式
	 */
					
	private String huandangfangshi;
	
	/**
	 * 车辆照片
	 */
					
	private String cheliangzhaopian;
	
	/**
	 * 排量
	 */
					
	private String pailiang;
	
	/**
	 * 车身类型
	 */
					
	private String cheshenleixing;
	
	/**
	 * 车重
	 */
					
	private String chezhong;
	
	/**
	 * 油箱容积
	 */
					
	private String youxiangrongji;
	
	/**
	 * 车门数
	 */
					
	private String chemenshu;
	
	/**
	 * 轴距
	 */
					
	private String zhouju;
	
	/**
	 * 车座
	 */
					
	private String chezuo;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 车辆详情
	 */
					
	private String cheliangxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：车辆编号
	 */
	public void setCheliangbianhao(String cheliangbianhao) {
		this.cheliangbianhao = cheliangbianhao;
	}
	/**
	 * 获取：车辆编号
	 */
	public String getCheliangbianhao() {
		return cheliangbianhao;
	}
	/**
	 * 设置：车辆品牌
	 */
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
	/**
	 * 设置：车辆型号
	 */
	public void setCheliangxinghao(String cheliangxinghao) {
		this.cheliangxinghao = cheliangxinghao;
	}
	/**
	 * 获取：车辆型号
	 */
	public String getCheliangxinghao() {
		return cheliangxinghao;
	}
	/**
	 * 设置：颜色
	 */
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
	/**
	 * 设置：换挡方式
	 */
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
	/**
	 * 设置：车辆照片
	 */
	public void setCheliangzhaopian(String cheliangzhaopian) {
		this.cheliangzhaopian = cheliangzhaopian;
	}
	/**
	 * 获取：车辆照片
	 */
	public String getCheliangzhaopian() {
		return cheliangzhaopian;
	}
	/**
	 * 设置：排量
	 */
	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}
	/**
	 * 获取：排量
	 */
	public String getPailiang() {
		return pailiang;
	}
	/**
	 * 设置：车身类型
	 */
	public void setCheshenleixing(String cheshenleixing) {
		this.cheshenleixing = cheshenleixing;
	}
	/**
	 * 获取：车身类型
	 */
	public String getCheshenleixing() {
		return cheshenleixing;
	}
	/**
	 * 设置：车重
	 */
	public void setChezhong(String chezhong) {
		this.chezhong = chezhong;
	}
	/**
	 * 获取：车重
	 */
	public String getChezhong() {
		return chezhong;
	}
	/**
	 * 设置：油箱容积
	 */
	public void setYouxiangrongji(String youxiangrongji) {
		this.youxiangrongji = youxiangrongji;
	}
	/**
	 * 获取：油箱容积
	 */
	public String getYouxiangrongji() {
		return youxiangrongji;
	}
	/**
	 * 设置：车门数
	 */
	public void setChemenshu(String chemenshu) {
		this.chemenshu = chemenshu;
	}
	/**
	 * 获取：车门数
	 */
	public String getChemenshu() {
		return chemenshu;
	}
	/**
	 * 设置：轴距
	 */
	public void setZhouju(String zhouju) {
		this.zhouju = zhouju;
	}
	/**
	 * 获取：轴距
	 */
	public String getZhouju() {
		return zhouju;
	}
	/**
	 * 设置：车座
	 */
	public void setChezuo(String chezuo) {
		this.chezuo = chezuo;
	}
	/**
	 * 获取：车座
	 */
	public String getChezuo() {
		return chezuo;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
	/**
	 * 设置：车辆详情
	 */
	public void setCheliangxiangqing(String cheliangxiangqing) {
		this.cheliangxiangqing = cheliangxiangqing;
	}
	/**
	 * 获取：车辆详情
	 */
	public String getCheliangxiangqing() {
		return cheliangxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
