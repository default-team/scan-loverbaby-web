package xyz.loverbaby.web.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.loverbaby.api.dto.common.CommonResult;
import xyz.loverbaby.api.enums.ResultCodes;
import xyz.loverbaby.web.utils.ResultUtils;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public CommonResult baseException(Exception ex) {
        LOG.error(ex.getMessage(), ex);
        return ResultUtils.failure(ResultCodes.BUSINESS_ERROR, ex.getMessage());
    }
}