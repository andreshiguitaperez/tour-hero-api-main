package co.udea.hero.api.service;

import co.udea.hero.api.model.Hero;

import java.util.List;
import java.util.Optional;

public interface IHeroService {
    List<Hero> getHeroes();

    Hero getHero(Integer id);

    Optional<Hero> findByName(String name);

    Hero searchHeroes(String name);

    Hero addHero(Hero hero);

    void deleteHero(Integer id);
}
