package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.InterestDto;
import com.projetparty.projetparty.entity.Interest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T11:22:07+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class InterestMapperImpl implements InterestMapper {

    @Override
    public InterestDto toDto(Interest interest) {
        if ( interest == null ) {
            return null;
        }

        InterestDto interestDto = new InterestDto();

        interestDto.setId( interest.getId() );
        interestDto.setLabel( interest.getLabel() );

        return interestDto;
    }

    @Override
    public Interest toEntity(InterestDto interestDto) {
        if ( interestDto == null ) {
            return null;
        }

        Interest interest = new Interest();

        interest.setId( interestDto.getId() );
        interest.setLabel( interestDto.getLabel() );

        return interest;
    }

    @Override
    public List<InterestDto> toDtos(List<Interest> interests) {
        if ( interests == null ) {
            return null;
        }

        List<InterestDto> list = new ArrayList<InterestDto>( interests.size() );
        for ( Interest interest : interests ) {
            list.add( toDto( interest ) );
        }

        return list;
    }

    @Override
    public List<Interest> toEntities(List<InterestDto> interestDtos) {
        if ( interestDtos == null ) {
            return null;
        }

        List<Interest> list = new ArrayList<Interest>( interestDtos.size() );
        for ( InterestDto interestDto : interestDtos ) {
            list.add( toEntity( interestDto ) );
        }

        return list;
    }
}
