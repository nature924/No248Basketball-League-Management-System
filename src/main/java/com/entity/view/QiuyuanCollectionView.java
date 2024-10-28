package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.QiuyuanCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 球员收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("qiuyuan_collection")
public class QiuyuanCollectionView extends QiuyuanCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String qiuyuanCollectionValue;

	//级联表 球员
		/**
		* 球员姓名
		*/

		@ColumnInfo(comment="球员姓名",type="varchar(200)")
		private String qiuyuanName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String qiuyuanPhoto;
		/**
		* 身高
		*/

		@ColumnInfo(comment="身高",type="varchar(200)")
		private String qiuyuanShengao;
		/**
		* 体重
		*/

		@ColumnInfo(comment="体重",type="varchar(200)")
		private String qiuyuanTizhong;
		/**
		* 年龄
		*/

		@ColumnInfo(comment="年龄",type="varchar(200)")
		private String qiuyuanAge;
		/**
		* 进球数
		*/

		@ColumnInfo(comment="进球数",type="int(11)")
		private Integer qiuyuanJinqiushu;
		/**
		* 助攻数
		*/

		@ColumnInfo(comment="助攻数",type="int(11)")
		private Integer qiuyuanZhugong;
		/**
		* 获得奖杯
		*/

		@ColumnInfo(comment="获得奖杯",type="int(11)")
		private Integer qiuyuanJiangbei;
		/**
		* 球员位置
		*/
		@ColumnInfo(comment="球员位置",type="int(11)")
		private Integer qiuyuanTypes;
			/**
			* 球员位置的值
			*/
			@ColumnInfo(comment="球员位置的字典表值",type="varchar(200)")
			private String qiuyuanValue;
							/**
		* 球员详情
		*/

		@ColumnInfo(comment="球员详情",type="text")
		private String qiuyuanContent;
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

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public QiuyuanCollectionView() {

	}

	public QiuyuanCollectionView(QiuyuanCollectionEntity qiuyuanCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, qiuyuanCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getQiuyuanCollectionValue() {
		return qiuyuanCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setQiuyuanCollectionValue(String qiuyuanCollectionValue) {
		this.qiuyuanCollectionValue = qiuyuanCollectionValue;
	}


	//级联表的get和set 球员

		/**
		* 获取： 球员姓名
		*/
		public String getQiuyuanName() {
			return qiuyuanName;
		}
		/**
		* 设置： 球员姓名
		*/
		public void setQiuyuanName(String qiuyuanName) {
			this.qiuyuanName = qiuyuanName;
		}

		/**
		* 获取： 头像
		*/
		public String getQiuyuanPhoto() {
			return qiuyuanPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setQiuyuanPhoto(String qiuyuanPhoto) {
			this.qiuyuanPhoto = qiuyuanPhoto;
		}

		/**
		* 获取： 身高
		*/
		public String getQiuyuanShengao() {
			return qiuyuanShengao;
		}
		/**
		* 设置： 身高
		*/
		public void setQiuyuanShengao(String qiuyuanShengao) {
			this.qiuyuanShengao = qiuyuanShengao;
		}

		/**
		* 获取： 体重
		*/
		public String getQiuyuanTizhong() {
			return qiuyuanTizhong;
		}
		/**
		* 设置： 体重
		*/
		public void setQiuyuanTizhong(String qiuyuanTizhong) {
			this.qiuyuanTizhong = qiuyuanTizhong;
		}

		/**
		* 获取： 年龄
		*/
		public String getQiuyuanAge() {
			return qiuyuanAge;
		}
		/**
		* 设置： 年龄
		*/
		public void setQiuyuanAge(String qiuyuanAge) {
			this.qiuyuanAge = qiuyuanAge;
		}

		/**
		* 获取： 进球数
		*/
		public Integer getQiuyuanJinqiushu() {
			return qiuyuanJinqiushu;
		}
		/**
		* 设置： 进球数
		*/
		public void setQiuyuanJinqiushu(Integer qiuyuanJinqiushu) {
			this.qiuyuanJinqiushu = qiuyuanJinqiushu;
		}

		/**
		* 获取： 助攻数
		*/
		public Integer getQiuyuanZhugong() {
			return qiuyuanZhugong;
		}
		/**
		* 设置： 助攻数
		*/
		public void setQiuyuanZhugong(Integer qiuyuanZhugong) {
			this.qiuyuanZhugong = qiuyuanZhugong;
		}

		/**
		* 获取： 获得奖杯
		*/
		public Integer getQiuyuanJiangbei() {
			return qiuyuanJiangbei;
		}
		/**
		* 设置： 获得奖杯
		*/
		public void setQiuyuanJiangbei(Integer qiuyuanJiangbei) {
			this.qiuyuanJiangbei = qiuyuanJiangbei;
		}
		/**
		* 获取： 球员位置
		*/
		public Integer getQiuyuanTypes() {
			return qiuyuanTypes;
		}
		/**
		* 设置： 球员位置
		*/
		public void setQiuyuanTypes(Integer qiuyuanTypes) {
			this.qiuyuanTypes = qiuyuanTypes;
		}


			/**
			* 获取： 球员位置的值
			*/
			public String getQiuyuanValue() {
				return qiuyuanValue;
			}
			/**
			* 设置： 球员位置的值
			*/
			public void setQiuyuanValue(String qiuyuanValue) {
				this.qiuyuanValue = qiuyuanValue;
			}

		/**
		* 获取： 球员详情
		*/
		public String getQiuyuanContent() {
			return qiuyuanContent;
		}
		/**
		* 设置： 球员详情
		*/
		public void setQiuyuanContent(String qiuyuanContent) {
			this.qiuyuanContent = qiuyuanContent;
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

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "QiuyuanCollectionView{" +
			", qiuyuanCollectionValue=" + qiuyuanCollectionValue +
			", qiuyuanName=" + qiuyuanName +
			", qiuyuanPhoto=" + qiuyuanPhoto +
			", qiuyuanShengao=" + qiuyuanShengao +
			", qiuyuanTizhong=" + qiuyuanTizhong +
			", qiuyuanAge=" + qiuyuanAge +
			", qiuyuanJinqiushu=" + qiuyuanJinqiushu +
			", qiuyuanZhugong=" + qiuyuanZhugong +
			", qiuyuanJiangbei=" + qiuyuanJiangbei +
			", qiuyuanContent=" + qiuyuanContent +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
