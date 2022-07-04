package terch.inno.hrservice.service;

import terch.inno.hrservice.domain.dto.User;
import terch.inno.hrservice.domain.dto.UserDto;

import java.util.UUID;

public interface UserService {

    UserDto getById(UUID id);

    User save(UserDto userDto);
}
