package terch.inno.hrservice.function;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import terch.inno.hrservice.domain.dto.OpenDto;
import terch.inno.hrservice.domain.dto.UserDto;
import terch.inno.hrservice.service.UserService;

import java.util.UUID;
import java.util.function.Function;

@Slf4j
@Component
@RequiredArgsConstructor
public class OpenUser implements Function<OpenDto, UserDto> {

    private final UserService userService;

    @Override
    public UserDto apply(OpenDto openDto) {
        final UUID id = openDto.getId();
        log.info("Opening user with id: {}", id);
        //todo  Добавить handler ошибок с отправкой в очередь ошибок
        return userService.getById(id);
    }
}
