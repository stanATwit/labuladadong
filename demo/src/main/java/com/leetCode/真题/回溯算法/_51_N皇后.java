package com.leetCode.真题.回溯算法;

import java.util.*;

import static org.apache.xmlbeans.impl.store.CharUtil.isValid;

/**
 * @Author stan
 * @Date 2021/11/16
 * @Describe
 * @Version 1.0
 */
public class _51_N皇后 {
    public static void main(String[] args) {
        _51_N皇后 n皇后 = new _51_N皇后();
        for (List<String> solveNQueen : n皇后.solveNQueens(8)) {
            System.out.println(solveNQueen.toString());
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        /*分别记录列，左右斜线上是否有皇后*/
        Set<Integer> columns = new HashSet<Integer>();
        Set<Integer> diagonals1 = new HashSet<Integer>();
        Set<Integer> diagonals2 = new HashSet<Integer>();
        backtrack(res, queens, n, 0, columns, diagonals1, diagonals2);
        return res;
    }

    public void backtrack(List<List<String>> solutions, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        //结束条件: 当行数达到n
        if (row == n) {
            List<String> board = generateBoard(queens, n);
            solutions.add(board);
        } else {
            /*可选列表*/
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) {
                    continue;
                }
                /*从左上到右下方向:行下标与列下标之差相等*/
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) {
                    continue;
                }
                /*从右上到左下方向，同一条斜线上的每个位置满足行下标与列下标之和相等*/
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) {
                    continue;
                }
                /*选择*/
                queens[row] = i;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                backtrack(solutions, queens, n, row + 1, columns, diagonals1, diagonals2);
                /*撤销选择*/
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    public List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
