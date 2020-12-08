package club.nazarick.filemiddleware.handler;

import club.nazarick.filemiddleware.dto.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public CommonResult<?> handleException(Exception e) {
        log.error(e.getMessage(), e);
        return CommonResult.error(e.getMessage());
    }
}
