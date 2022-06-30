package utils;

import java.util.*;

public class Orchestrator {
    public static List<List<String>> findValidCubeConfigurations(
            List<String> firstCube, List<String> secondCube, List<String> thirdCube, List<String> fourthCube) {

        List<List<String>> validPermutations = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 6; l++) {
                        List<String> permutations = Permutator.calculatePermutations(
                                firstCube.get(i), secondCube.get(j), thirdCube.get(k), fourthCube.get(l));

                        List<String> currResult = Extractor.extractValidPermutations(permutations);
                        if (currResult.size() != 0) {
                            validPermutations.add(currResult);
                        }
                    }
                }
            }
        }
        return validPermutations;
    }
}