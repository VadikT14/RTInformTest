def countNumbers(List list) {
    def map = [:].withDefault { 0 }
    list.each { number ->
        map[number]++
    }
    return map
}

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countNumbers(list)
println result

