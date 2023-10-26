//package net.requiem.pathogen.TreeBuilder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Tree {
//    private int data;
//    private List<Tree> leaves = new ArrayList<>();
//    private double x = 0;
//    private double y = 0;
//
//    public Tree(int data, List<Tree> leaves) {
//        this.data = data;
//        if (leaves != null) {
//            this.leaves.addAll(leaves);
//        }
//    }
//
//    public List<int[]> getElements(int stage) {
//        List<int[]> res = new ArrayList<>();
//        res.add(new int[]{stage, this});
//        if (!leaves.isEmpty()) {
//            for (Tree leaf : leaves) {
//                res.addAll(leaf.getElements(stage + 1));
//            }
//        }
//        return res;
//    }
//
//    public List<double[]> getLines() {
//        List<double[]> res = new ArrayList<>();
//        if (!leaves.isEmpty()) {
//            for (Tree leaf : leaves) {
//                res.add(new double[]{this.x, this.y, leaf.x, leaf.y});
//                res.addAll(leaf.getLines());
//            }
//        }
//        return res;
//    }
//}
