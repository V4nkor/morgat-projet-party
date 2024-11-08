package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.RatingDto;
import com.projetparty.projetparty.entity.Rating;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T16:31:41+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class RatingMapperImpl implements RatingMapper {

    @Override
    public RatingDto toDto(Rating rating) {
        if ( rating == null ) {
            return null;
        }

        RatingDto ratingDto = new RatingDto();

        ratingDto.setId( rating.getId() );
        ratingDto.setStars( rating.getStars() );
        ratingDto.setComment( rating.getComment() );

        return ratingDto;
    }

    @Override
    public Rating toEntity(RatingDto ratingDto) {
        if ( ratingDto == null ) {
            return null;
        }

        Rating rating = new Rating();

        rating.setId( ratingDto.getId() );
        rating.setStars( ratingDto.getStars() );
        rating.setComment( ratingDto.getComment() );

        return rating;
    }

    @Override
    public List<RatingDto> toDtos(List<Rating> ratings) {
        if ( ratings == null ) {
            return null;
        }

        List<RatingDto> list = new ArrayList<RatingDto>( ratings.size() );
        for ( Rating rating : ratings ) {
            list.add( toDto( rating ) );
        }

        return list;
    }

    @Override
    public List<Rating> toEntities(List<RatingDto> ratingDtos) {
        if ( ratingDtos == null ) {
            return null;
        }

        List<Rating> list = new ArrayList<Rating>( ratingDtos.size() );
        for ( RatingDto ratingDto : ratingDtos ) {
            list.add( toEntity( ratingDto ) );
        }

        return list;
    }
}
