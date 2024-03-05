public static boolean isPrime(int number) {
    if(number == 1 || number == 0) return false;

    for (int i = 2; i <= (int) Math.sqrt(number); i++) {
        if(number % i == 0) return false;
    }

    return true;
}
