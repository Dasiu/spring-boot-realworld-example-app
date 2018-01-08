package io.spring;

import io.spring.core.service.validation.UserValidator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserValidationTest {

    @Test
    public void shouldValidateEmail() throws Exception {
        // given
        UserValidator userValidator = new UserValidator();

        Object data = new Object();

        // when
        String result = userValidator.validate(data);

        // then
        assertThat(result).isNotNull();
    }
}
