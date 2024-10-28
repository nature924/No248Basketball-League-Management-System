package com.entity.model;

import com.entity.QiuduiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 球队收藏
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiuduiCollectionModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 球队
     */
    private Integer qiuduiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 类型
     */
    private Integer qiuduiCollectionTypes;


    /**
     * 收藏时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
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
	 * 获取：球队
	 */
    public Integer getQiuduiId() {
        return qiuduiId;
    }


    /**
	 * 设置：球队
	 */
    public void setQiuduiId(Integer qiuduiId) {
        this.qiuduiId = qiuduiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getQiuduiCollectionTypes() {
        return qiuduiCollectionTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setQiuduiCollectionTypes(Integer qiuduiCollectionTypes) {
        this.qiuduiCollectionTypes = qiuduiCollectionTypes;
    }
    /**
	 * 获取：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：收藏时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
