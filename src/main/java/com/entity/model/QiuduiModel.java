package com.entity.model;

import com.entity.QiuduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 球队
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiuduiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 球队名称
     */
    private String qiuduiName;


    /**
     * 球队编号
     */
    private String qiuduiUuidNumber;


    /**
     * 球队照片
     */
    private String qiuduiPhoto;


    /**
     * 球队主教练
     */
    private String qiuduiJiaiolian;


    /**
     * 所属国家
     */
    private String qiuduiGuojia;


    /**
     * 球队地点
     */
    private String qiuduiAddress;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 球队创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chuangjianTime;


    /**
     * 球队类型
     */
    private Integer qiuduiTypes;


    /**
     * 球队热度
     */
    private Integer qiuduiClicknum;


    /**
     * 球队介绍
     */
    private String qiuduiContent;


    /**
     * 球队荣誉
     */
    private String qiuduiRongyuContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：球队名称
	 */
    public String getQiuduiName() {
        return qiuduiName;
    }


    /**
	 * 设置：球队名称
	 */
    public void setQiuduiName(String qiuduiName) {
        this.qiuduiName = qiuduiName;
    }
    /**
	 * 获取：球队编号
	 */
    public String getQiuduiUuidNumber() {
        return qiuduiUuidNumber;
    }


    /**
	 * 设置：球队编号
	 */
    public void setQiuduiUuidNumber(String qiuduiUuidNumber) {
        this.qiuduiUuidNumber = qiuduiUuidNumber;
    }
    /**
	 * 获取：球队照片
	 */
    public String getQiuduiPhoto() {
        return qiuduiPhoto;
    }


    /**
	 * 设置：球队照片
	 */
    public void setQiuduiPhoto(String qiuduiPhoto) {
        this.qiuduiPhoto = qiuduiPhoto;
    }
    /**
	 * 获取：球队主教练
	 */
    public String getQiuduiJiaiolian() {
        return qiuduiJiaiolian;
    }


    /**
	 * 设置：球队主教练
	 */
    public void setQiuduiJiaiolian(String qiuduiJiaiolian) {
        this.qiuduiJiaiolian = qiuduiJiaiolian;
    }
    /**
	 * 获取：所属国家
	 */
    public String getQiuduiGuojia() {
        return qiuduiGuojia;
    }


    /**
	 * 设置：所属国家
	 */
    public void setQiuduiGuojia(String qiuduiGuojia) {
        this.qiuduiGuojia = qiuduiGuojia;
    }
    /**
	 * 获取：球队地点
	 */
    public String getQiuduiAddress() {
        return qiuduiAddress;
    }


    /**
	 * 设置：球队地点
	 */
    public void setQiuduiAddress(String qiuduiAddress) {
        this.qiuduiAddress = qiuduiAddress;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：球队创建时间
	 */
    public Date getChuangjianTime() {
        return chuangjianTime;
    }


    /**
	 * 设置：球队创建时间
	 */
    public void setChuangjianTime(Date chuangjianTime) {
        this.chuangjianTime = chuangjianTime;
    }
    /**
	 * 获取：球队类型
	 */
    public Integer getQiuduiTypes() {
        return qiuduiTypes;
    }


    /**
	 * 设置：球队类型
	 */
    public void setQiuduiTypes(Integer qiuduiTypes) {
        this.qiuduiTypes = qiuduiTypes;
    }
    /**
	 * 获取：球队热度
	 */
    public Integer getQiuduiClicknum() {
        return qiuduiClicknum;
    }


    /**
	 * 设置：球队热度
	 */
    public void setQiuduiClicknum(Integer qiuduiClicknum) {
        this.qiuduiClicknum = qiuduiClicknum;
    }
    /**
	 * 获取：球队介绍
	 */
    public String getQiuduiContent() {
        return qiuduiContent;
    }


    /**
	 * 设置：球队介绍
	 */
    public void setQiuduiContent(String qiuduiContent) {
        this.qiuduiContent = qiuduiContent;
    }
    /**
	 * 获取：球队荣誉
	 */
    public String getQiuduiRongyuContent() {
        return qiuduiRongyuContent;
    }


    /**
	 * 设置：球队荣誉
	 */
    public void setQiuduiRongyuContent(String qiuduiRongyuContent) {
        this.qiuduiRongyuContent = qiuduiRongyuContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
