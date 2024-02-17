package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("todo_lists")
public class TodoItem {
    @TableId(type = IdType.AUTO)

    private Long id;
    private String title;
    private String description;
}

