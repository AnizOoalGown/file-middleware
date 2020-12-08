package club.nazarick.filemiddleware.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class CommonResult<T> {
    int code;
    String msg;
    T data;

    public static <T> CommonResult<T> build(int code, String msg, T data) {
        return new CommonResult<>(code, msg, data);
    }

    public static <T> CommonResult<T> success(T data) {
        return build(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    public static <T> CommonResult<T> error(String msg) {
        return build(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg, null);
    }
}
