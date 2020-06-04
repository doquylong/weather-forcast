package ua.dp.michaellang.weather.data.repository.entity.mapper;


public interface Mapper<From, To> {
    To map(From from);
}
