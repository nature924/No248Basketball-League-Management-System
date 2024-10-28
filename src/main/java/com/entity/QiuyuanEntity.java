package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 球员
 *
 * @author 
 * @email
 */
@TableName("qiuyuan")
public class QiuyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiuyuanEntity() {

	}

	public QiuyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 球员姓名
     */
    @ColumnInfo(comment="球员姓名",type="varchar(200)")
    @TableField(value = "qiuyuan_name")

    private String qiuyuanName;


    /**
     * 头像
     */
    @ColumnInfo(comment="头像",type="varchar(255)")
    @TableField(value = "qiuyuan_photo")

    private String qiuyuanPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 身高
     */
    @ColumnInfo(comment="身高",type="varchar(200)")
    @TableField(value = "qiuyuan_shengao")

    private String qiuyuanShengao;


    /**
     * 体重
     */
    @ColumnInfo(comment="体重",type="varchar(200)")
    @TableField(value = "qiuyuan_tizhong")

    private String qiuyuanTizhong;


    /**
     * 年龄
     */
    @ColumnInfo(comment="年龄",type="varchar(200)")
    @TableField(value = "qiuyuan_age")

    private String qiuyuanAge;


    /**
     * 进球数
     */
    @ColumnInfo(comment="进球数",type="int(11)")
    @TableField(value = "qiuyuan_jinqiushu")

    private Integer qiuyuanJinqiushu;


    /**
     * 助攻数
     */
    @ColumnInfo(comment="助攻数",type="int(11)")
    @TableField(value = "qiuyuan_zhugong")

    private Integer qiuyuanZhugong;


    /**
     * 获得奖杯
     */
    @ColumnInfo(comment="获得奖杯",type="int(11)")
    @TableField(value = "qiuyuan_jiangbei")

    private Integer qiuyuanJiangbei;


    /**
     * 球员位置
     */
    @ColumnInfo(comment="球员位置",type="int(11)")
    @TableField(value = "qiuyuan_types")

    private Integer qiuyuanTypes;


    /**
     * 所属球队
     */
    @ColumnInfo(comment="所属球队",type="int(11)")
    @TableField(value = "qiudui_id")

    private Integer qiuduiId;


    /**
     * 球员详情
     */
    @ColumnInfo(comment="球员详情",type="text")
    @TableField(value = "qiuyuan_content")

    private String qiuyuanContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：球员姓名
	 */
    public String getQiuyuanName() {
        return qiuyuanName;
    }
    /**
	 * 设置：球员姓名
	 */

    public void setQiuyuanName(String qiuyuanName) {
        this.qiuyuanName = qiuyuanName;
    }
    /**
	 * 获取：头像
	 */
    public String getQiuyuanPhoto() {
        return qiuyuanPhoto;
    }
    /**
	 * 设置：头像
	 */

    public void setQiuyuanPhoto(String qiuyuanPhoto) {
        this.qiuyuanPhoto = qiuyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身高
	 */
    public String getQiuyuanShengao() {
        return qiuyuanShengao;
    }
    /**
	 * 设置：身高
	 */

    public void setQiuyuanShengao(String qiuyuanShengao) {
        this.qiuyuanShengao = qiuyuanShengao;
    }
    /**
	 * 获取：体重
	 */
    public String getQiuyuanTizhong() {
        return qiuyuanTizhong;
    }
    /**
	 * 设置：体重
	 */

    public void setQiuyuanTizhong(String qiuyuanTizhong) {
        this.qiuyuanTizhong = qiuyuanTizhong;
    }
    /**
	 * 获取：年龄
	 */
    public String getQiuyuanAge() {
        return qiuyuanAge;
    }
    /**
	 * 设置：年龄
	 */

    public void setQiuyuanAge(String qiuyuanAge) {
        this.qiuyuanAge = qiuyuanAge;
    }
    /**
	 * 获取：进球数
	 */
    public Integer getQiuyuanJinqiushu() {
        return qiuyuanJinqiushu;
    }
    /**
	 * 设置：进球数
	 */

    public void setQiuyuanJinqiushu(Integer qiuyuanJinqiushu) {
        this.qiuyuanJinqiushu = qiuyuanJinqiushu;
    }
    /**
	 * 获取：助攻数
	 */
    public Integer getQiuyuanZhugong() {
        return qiuyuanZhugong;
    }
    /**
	 * 设置：助攻数
	 */

    public void setQiuyuanZhugong(Integer qiuyuanZhugong) {
        this.qiuyuanZhugong = qiuyuanZhugong;
    }
    /**
	 * 获取：获得奖杯
	 */
    public Integer getQiuyuanJiangbei() {
        return qiuyuanJiangbei;
    }
    /**
	 * 设置：获得奖杯
	 */

    public void setQiuyuanJiangbei(Integer qiuyuanJiangbei) {
        this.qiuyuanJiangbei = qiuyuanJiangbei;
    }
    /**
	 * 获取：球员位置
	 */
    public Integer getQiuyuanTypes() {
        return qiuyuanTypes;
    }
    /**
	 * 设置：球员位置
	 */

    public void setQiuyuanTypes(Integer qiuyuanTypes) {
        this.qiuyuanTypes = qiuyuanTypes;
    }
    /**
	 * 获取：所属球队
	 */
    public Integer getQiuduiId() {
        return qiuduiId;
    }
    /**
	 * 设置：所属球队
	 */

    public void setQiuduiId(Integer qiuduiId) {
        this.qiuduiId = qiuduiId;
    }
    /**
	 * 获取：球员详情
	 */
    public String getQiuyuanContent() {
        return qiuyuanContent;
    }
    /**
	 * 设置：球员详情
	 */

    public void setQiuyuanContent(String qiuyuanContent) {
        this.qiuyuanContent = qiuyuanContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qiuyuan{" +
            ", id=" + id +
            ", qiuyuanName=" + qiuyuanName +
            ", qiuyuanPhoto=" + qiuyuanPhoto +
            ", sexTypes=" + sexTypes +
            ", qiuyuanShengao=" + qiuyuanShengao +
            ", qiuyuanTizhong=" + qiuyuanTizhong +
            ", qiuyuanAge=" + qiuyuanAge +
            ", qiuyuanJinqiushu=" + qiuyuanJinqiushu +
            ", qiuyuanZhugong=" + qiuyuanZhugong +
            ", qiuyuanJiangbei=" + qiuyuanJiangbei +
            ", qiuyuanTypes=" + qiuyuanTypes +
            ", qiuduiId=" + qiuduiId +
            ", qiuyuanContent=" + qiuyuanContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
