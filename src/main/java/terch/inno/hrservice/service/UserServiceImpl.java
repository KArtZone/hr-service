package terch.inno.hrservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import terch.inno.hrservice.domain.dto.User;
import terch.inno.hrservice.domain.dto.UserDto;
import terch.inno.hrservice.domain.mapper.UserMapper;
import terch.inno.hrservice.repository.UserRepository;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.UUID;

import static java.lang.String.format;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    @Transactional
    public UserDto getById(UUID id) {
        final User user = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        format("User with id %s not found", id)));
        return mapper.toDto(user);
    }

    @Override
    public User save(UserDto userDto) {
        final User user = mapper.toEntity(userDto);
        return repository.save(user);
    }
}
