package algrithm;

import instance.Instance;
import algrithm.GreedyVRP;
import alns.config.ControlParameter;
import alns.config.IALNSConfig;


public class Solver {

    public Solver() {
    }

    public Solution getInitialSolution(Instance instance) {
    	GreedyVRP greedyVRP = new GreedyVRP(instance);
    	return greedyVRP.getInitialSolution();
    }

    public Solution improveSolution(Solution s, IALNSConfig ac, ControlParameter cp, Instance is) throws Exception {
        MyALNSProcess ALNS = new MyALNSProcess(s, is, ac, cp);
    	return ALNS.improveSolution();
    }
}
