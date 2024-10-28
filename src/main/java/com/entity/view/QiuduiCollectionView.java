package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.QiuduiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 球队收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("qiudui_collection")
public class QiuduiCollectionView extends QiuduiCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String qiuduiCollectionValue;

	//级联表 球队
		/**
		* 球队名称
		*/

		@ColumnInfo(comment="球队名称",type="varchar(200)")
		private String qiuduiName;
		/**
		* 球队编号
		*/

		@ColumnInfo(comment="球队编号",type="varchar(200)")
		private String qiuduiUuidNumber;
		/**
		* 球队照片
		*/

		@ColumnInfo(comment="球队照片",type="varchar(200)")
		private String qiuduiPhoto;
		/**
		* 球队主教练
		*/

		@ColumnInfo(comment="球队主教练",type="varchar(200)")
		private String qiuduiJiaiolian;
		/**
		* 所属国家
		*/

		@ColumnInfo(comment="所属国家",type="varchar(200)")
		private String qiuduiGuojia;
		/**
		* 球队地点
		*/

		@ColumnInfo(comment="球队地点",type="varchar(200)")
		private String qiuduiAddress;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 球队创建时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="球队创建时间",type="date")
		private Date chuangjianTime;
		/**
		* 球队类型
		*/
		@ColumnInfo(comment="球队类型",type="int(11)")
		private Integer qiuduiTypes;
			/**
			* 球队类型的值
			*/
			@ColumnInfo(comment="球队类型的字典表值",type="varchar(200)")
			private String qiuduiValue;
		/**
		* 球队热度
		*/

		@ColumnInfo(comment="球队热度",type="int(11)")
		private Integer qiuduiClicknum;
		/**
		* 球队介绍
		*/

		@ColumnInfo(comment="球队介绍",type="longtext")
		private String qiuduiContent;
		/**
		* 球队荣誉
		*/

		@ColumnInfo(comment="球队荣誉",type="longtext")
		private String qiuduiRongyuContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public QiuduiCollectionView() {

	}

	public QiuduiCollectionView(QiuduiCollectionEntity qiuduiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, qiuduiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getQiuduiCollectionValue() {
		return qiuduiCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setQiuduiCollectionValue(String qiuduiCollectionValue) {
		this.qiuduiCollectionValue = qiuduiCollectionValue;
	}


	//级联表的get和set 球队

		/**
		* 获取： 球队名称
		*/
		public String getQiuduiName() {
			return qiuduiName;
		}
		/**
		* 设置： 球队名称
		*/
		public void setQiuduiName(String qiuduiName) {
			this.qiuduiName = qiuduiName;
		}

		/**
		* 获取： 球队编号
		*/
		public String getQiuduiUuidNumber() {
			return qiuduiUuidNumber;
		}
		/**
		* 设置： 球队编号
		*/
		public void setQiuduiUuidNumber(String qiuduiUuidNumber) {
			this.qiuduiUuidNumber = qiuduiUuidNumber;
		}

		/**
		* 获取： 球队照片
		*/
		public String getQiuduiPhoto() {
			return qiuduiPhoto;
		}
		/**
		* 设置： 球队照片
		*/
		public void setQiuduiPhoto(String qiuduiPhoto) {
			this.qiuduiPhoto = qiuduiPhoto;
		}

		/**
		* 获取： 球队主教练
		*/
		public String getQiuduiJiaiolian() {
			return qiuduiJiaiolian;
		}
		/**
		* 设置： 球队主教练
		*/
		public void setQiuduiJiaiolian(String qiuduiJiaiolian) {
			this.qiuduiJiaiolian = qiuduiJiaiolian;
		}

		/**
		* 获取： 所属国家
		*/
		public String getQiuduiGuojia() {
			return qiuduiGuojia;
		}
		/**
		* 设置： 所属国家
		*/
		public void setQiuduiGuojia(String qiuduiGuojia) {
			this.qiuduiGuojia = qiuduiGuojia;
		}

		/**
		* 获取： 球队地点
		*/
		public String getQiuduiAddress() {
			return qiuduiAddress;
		}
		/**
		* 设置： 球队地点
		*/
		public void setQiuduiAddress(String qiuduiAddress) {
			this.qiuduiAddress = qiuduiAddress;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 球队创建时间
		*/
		public Date getChuangjianTime() {
			return chuangjianTime;
		}
		/**
		* 设置： 球队创建时间
		*/
		public void setChuangjianTime(Date chuangjianTime) {
			this.chuangjianTime = chuangjianTime;
		}
		/**
		* 获取： 球队类型
		*/
		public Integer getQiuduiTypes() {
			return qiuduiTypes;
		}
		/**
		* 设置： 球队类型
		*/
		public void setQiuduiTypes(Integer qiuduiTypes) {
			this.qiuduiTypes = qiuduiTypes;
		}


			/**
			* 获取： 球队类型的值
			*/
			public String getQiuduiValue() {
				return qiuduiValue;
			}
			/**
			* 设置： 球队类型的值
			*/
			public void setQiuduiValue(String qiuduiValue) {
				this.qiuduiValue = qiuduiValue;
			}

		/**
		* 获取： 球队热度
		*/
		public Integer getQiuduiClicknum() {
			return qiuduiClicknum;
		}
		/**
		* 设置： 球队热度
		*/
		public void setQiuduiClicknum(Integer qiuduiClicknum) {
			this.qiuduiClicknum = qiuduiClicknum;
		}

		/**
		* 获取： 球队介绍
		*/
		public String getQiuduiContent() {
			return qiuduiContent;
		}
		/**
		* 设置： 球队介绍
		*/
		public void setQiuduiContent(String qiuduiContent) {
			this.qiuduiContent = qiuduiContent;
		}

		/**
		* 获取： 球队荣誉
		*/
		public String getQiuduiRongyuContent() {
			return qiuduiRongyuContent;
		}
		/**
		* 设置： 球队荣誉
		*/
		public void setQiuduiRongyuContent(String qiuduiRongyuContent) {
			this.qiuduiRongyuContent = qiuduiRongyuContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "QiuduiCollectionView{" +
			", qiuduiCollectionValue=" + qiuduiCollectionValue +
			", qiuduiName=" + qiuduiName +
			", qiuduiUuidNumber=" + qiuduiUuidNumber +
			", qiuduiPhoto=" + qiuduiPhoto +
			", qiuduiJiaiolian=" + qiuduiJiaiolian +
			", qiuduiGuojia=" + qiuduiGuojia +
			", qiuduiAddress=" + qiuduiAddress +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", chuangjianTime=" + DateUtil.convertString(chuangjianTime,"yyyy-MM-dd") +
			", qiuduiClicknum=" + qiuduiClicknum +
			", qiuduiContent=" + qiuduiContent +
			", qiuduiRongyuContent=" + qiuduiRongyuContent +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
