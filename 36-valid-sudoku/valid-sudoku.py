class Solution(object):
    def isValidSudoku(self, board):
        r=[]
        for i in range(9):
            for j in range(9):
                e=board[i][j]
                if e!='.':
                    r+=[(i,e),(e,j),(i//3,j//3,e)]
        return len(r)==len(set(r))