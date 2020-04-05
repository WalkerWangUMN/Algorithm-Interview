def head(Q):
    return Q[0]
def tail(Q):
    return Q[1:]

def mergeSort(U):
    if U == [] or tail(U) == []:
        return U
    L=[]
    R=[]
    while U != [] and tail(U) != []:
        L = L + head(U)
        U = tail(U)
        R = R + head(U)
        U = tail(U)
    L = L + U
    L = mergeSort(L)
    R = mergeSort(R)
    S = []
    while L != [] and R != []:
        if head(L) < head(R):
            S = S + head(L)
            L = tail(L)
        else:
            S = S + head(R)
            R = tail(R)
    S = S + L + R
    return S