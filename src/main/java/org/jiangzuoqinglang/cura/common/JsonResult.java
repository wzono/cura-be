package org.jiangzuoqinglang.cura.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * 向前端返回json结果
 *
 */
public class JsonResult {
    /**
     * 失败时返回json数据
     *
     * @param status
     * @param message
     * @param httpStatus
     *
     */
    public ResponseEntity<Object> failed(Integer status, String message, HttpStatus httpStatus){
        Map<String, Object> map = new HashMap<>();
        map.put("status", status);
        map.put("message", message);
        return new ResponseEntity<Object>(map, httpStatus);
    }

    /**
     * 成功时返回json数据
     *
     *
     * @param data
     *
     */
    public ResponseEntity<Object> success(Object data){
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "成功");
        map.put("data", data);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
