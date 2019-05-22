package xyz.loverbaby.web.utils;

import xyz.loverbaby.api.dto.common.CommonResult;
import xyz.loverbaby.api.enums.ResultCodes;

/**
 * @Classname ResultUtils
 * @Description
 * @Date 2019/5/21 下午11:36
 * @Created by yccao
 */
public class ResultUtils {
    public static<T> CommonResult<T> failure(ResultCodes resultCode,String msg){
        assert resultCode != null;
        CommonResult<T> result = new CommonResult<>();
        result.setCode(resultCode.getCode());
        result.setMessage(msg);
        return result;
    }

    private ResultUtils() {
    }
}
