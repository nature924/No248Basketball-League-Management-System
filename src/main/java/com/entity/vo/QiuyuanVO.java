package com.entity.vo;

import com.entity.QiuyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 球员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiuyuan")
public class QiuyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 球员姓名
     */

    @TableField(value = "qiuyuan_name")
    private String qiuyuanName;


    /**
     * 头像
     */

    @TableField(value = "qiuyuan_photo")
    private String qiuyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身高
     */

    @TableField(value = "qiuyuan_shengao")
    private String qiuyuanShengao;


    /**
     * 体重
     */

    @TableField(value = "qiuyuan_tizhong")
    private String qiuyuanTizhong;


    /**
     * 年龄
     */

    @TableField(value = "qiuyuan_age")
    private String qiuyuanAge;


    /**
     * 进球数
     */

    @TableField(value = "qiuyuan_jinqiushu")
    private Integer qiuyuanJinqiushu;


    /**
     * 助攻数
     */

    @TableField(value = "qiuyuan_zhugong")
    private Integer qiuyuanZhugong;


    /**
     * 获得奖杯
     */

    @TableField(value = "qiuyuan_jiangbei")
    private Integer qiuyuanJiangbei;


    /**
     * 球员位置
     */

    @TableField(value = "qiuyuan_types")
    private Integer qiuyuanTypes;


    /**
     * 所属球队
     */

    @TableField(value = "qiudui_id")
    private Integer qiuduiId;


    /**
     * 球员详情
     */

    @TableField(value = "qiuyuan_content")
    private String qiuyuanContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：球员姓名
	 */
    public String getQiuyuanName() {
        return qiuyuanName;
    }


    /**
	 * 获取：球员姓名
	 */

    public void setQiuyuanName(String qiuyuanName) {
        this.qiuyuanName = qiuyuanName;
    }
    /**
	 * 设置：头像
	 */
    public String getQiuyuanPhoto() {
        return qiuyuanPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setQiuyuanPhoto(String qiuyuanPhoto) {
        this.qiuyuanPhoto = qiuyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身高
	 */
    public String getQiuyuanShengao() {
        return qiuyuanShengao;
    }


    /**
	 * 获取：身高
	 */

    public void setQiuyuanShengao(String qiuyuanShengao) {
        this.qiuyuanShengao = qiuyuanShengao;
    }
    /**
	 * 设置：体重
	 */
    public String getQiuyuanTizhong() {
        return qiuyuanTizhong;
    }


    /**
	 * 获取：体重
	 */

    public void setQiuyuanTizhong(String qiuyuanTizhong) {
        this.qiuyuanTizhong = qiuyuanTizhong;
    }
    /**
	 * 设置：年龄
	 */
    public String getQiuyuanAge() {
        return qiuyuanAge;
    }


    /**
	 * 获取：年龄
	 */

    public void setQiuyuanAge(String qiuyuanAge) {
        this.qiuyuanAge = qiuyuanAge;
    }
    /**
	 * 设置：进球数
	 */
    public Integer getQiuyuanJinqiushu() {
        return qiuyuanJinqiushu;
    }


    /**
	 * 获取：进球数
	 */

    public void setQiuyuanJinqiushu(Integer qiuyuanJinqiushu) {
        this.qiuyuanJinqiushu = qiuyuanJinqiushu;
    }
    /**
	 * 设置：助攻数
	 */
    public Integer getQiuyuanZhugong() {
        return qiuyuanZhugong;
    }


    /**
	 * 获取：助攻数
	 */

    public void setQiuyuanZhugong(Integer qiuyuanZhugong) {
        this.qiuyuanZhugong = qiuyuanZhugong;
    }
    /**
	 * 设置：获得奖杯
	 */
    public Integer getQiuyuanJiangbei() {
        return qiuyuanJiangbei;
    }


    /**
	 * 获取：获得奖杯
	 */

    public void setQiuyuanJiangbei(Integer qiuyuanJiangbei) {
        this.qiuyuanJiangbei = qiuyuanJiangbei;
    }
    /**
	 * 设置：球员位置
	 */
    public Integer getQiuyuanTypes() {
        return qiuyuanTypes;
    }


    /**
	 * 获取：球员位置
	 */

    public void setQiuyuanTypes(Integer qiuyuanTypes) {
        this.qiuyuanTypes = qiuyuanTypes;
    }
    /**
	 * 设置：所属球队
	 */
    public Integer getQiuduiId() {
        return qiuduiId;
    }


    /**
	 * 获取：所属球队
	 */

    public void setQiuduiId(Integer qiuduiId) {
        this.qiuduiId = qiuduiId;
    }
    /**
	 * 设置：球员详情
	 */
    public String getQiuyuanContent() {
        return qiuyuanContent;
    }


    /**
	 * 获取：球员详情
	 */

    public void setQiuyuanContent(String qiuyuanContent) {
        this.qiuyuanContent = qiuyuanContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
