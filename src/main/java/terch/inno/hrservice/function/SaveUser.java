package terch.inno.hrservice.function;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import terch.inno.hrservice.domain.dto.User;
import terch.inno.hrservice.domain.dto.UserDto;
import terch.inno.hrservice.service.UserService;

import java.util.function.Function;

@Slf4j
@Component
@RequiredArgsConstructor
public class SaveUser implements Function<UserDto, User> {

    private final UserService userService;

    @Override
    public User apply(UserDto userDto) {
        log.info("Saving user: {}", userDto);
        return userService.save(userDto);
    }
}
