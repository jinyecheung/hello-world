package com.akww.hello.world.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class BaseEntity<T extends Model<?>> extends Model<T> {

    /**  创建时间 **/
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**  创建人 **/
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**  更新时间 **/
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**  更新人 **/
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    /**  删除标记,1:已删除,0:正常 **/
    @TableField(fill = FieldFill.INSERT)
    private String deleteFlag;

}
