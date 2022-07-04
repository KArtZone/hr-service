package terch.inno.hrservice.domain.mapper;

import org.mapstruct.Mapper;
import terch.inno.hrservice.domain.dto.User;
import terch.inno.hrservice.domain.dto.UserDto;

@Mapper
public interface UserMapper {

    UserDto toDto(User entity);

    User toEntity(UserDto dto);

}
