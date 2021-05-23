package com.dgs.demoApp.DataFetchers;

import com.dgs.demoApp.domain.Battle;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class BattleDataFetcher {

    private final List<Battle> allBattles= List.of(
            Battle.builder().name("Battle of Gaul").king("Julius Caesar").build(),
            Battle.builder().name("Roman civil war").king("Mark Antony").build());

    @DgsQuery
    public List<Battle> battles(@InputArgument String nameFilter) {
        return allBattles.stream().filter(battles -> battles.getKing().startsWith(nameFilter)).collect(Collectors.toList());
    }
}
