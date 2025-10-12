#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include <stdarg.h>  // <--- เพิ่มตรงนี้สำหรับ va_list

const char *ones[] = {
    "zero","one","two","three","four","five","six","seven","eight","nine",
    "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
    "seventeen","eighteen","nineteen"
};

const char *tens[] = {
    "", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
};

void append_fmt(char *out, size_t out_size, size_t *idx, const char *fmt, ...) {
    if (*idx >= out_size) return;
    va_list ap;
    va_start(ap, fmt);
    int written = vsnprintf(out + *idx, (out_size > *idx) ? out_size - *idx : 0, fmt, ap);
    va_end(ap);
    if (written > 0) {
        *idx += (size_t)written;
        if (*idx >= out_size) *idx = out_size - 1;
    }
}

void subThousandToWords(int num, char *out, size_t out_size, size_t *idx) {
    if (num >= 100) {
        int h = num / 100;
        append_fmt(out, out_size, idx, "%s hundred", ones[h]);
        num %= 100;
        if (num) append_fmt(out, out_size, idx, " ");
    }
    if (num >= 20) {
        int t = num / 10;
        append_fmt(out, out_size, idx, "%s", tens[t]);
        int r = num % 10;
        if (r) append_fmt(out, out_size, idx, "-%s", ones[r]);
    } else if (num > 0 || *idx == 0) { // include zero only if nothing written yet
        append_fmt(out, out_size, idx, "%s", ones[num]);
    }
}

void numberToWords(long long n, char *out, size_t out_size) {
    if (out_size == 0) return;
    out[0] = '\0';
    size_t idx = 0;

    if (n == 0) {
        append_fmt(out, out_size, &idx, "%s", ones[0]);
        return;
    }

    if (n < 0) {
        append_fmt(out, out_size, &idx, "minus ");
        if (n == LLONG_MIN) {
            unsigned long long un = (unsigned long long)(-(n + 1)) + 1ULL;
            unsigned long long parts[] = {1000000000000ULL,1000000000ULL,1000000ULL,1000ULL,1ULL};
            const char *names[] = {" trillion", " billion", " million", " thousand", ""};
            int first = 1;
            for (int i = 0; i < 5; ++i) {
                unsigned long long p = parts[i];
                if (un >= p) {
                    unsigned long long chunk = un / p;
                    if (!first) append_fmt(out, out_size, &idx, " ");
                    subThousandToWords((int)chunk, out, out_size, &idx);
                    append_fmt(out, out_size, &idx, "%s", names[i]);
                    un %= p;
                    first = 0;
                }
            }
            return;
        } else {
            n = -n;
        }
    }

    unsigned long long un = (unsigned long long)n;
    unsigned long long parts[] = {1000000000000ULL,1000000000ULL,1000000ULL,1000ULL,1ULL};
    const char *names[] = {" trillion", " billion", " million", " thousand", ""};
    int first = 1;
    for (int i = 0; i < 5; ++i) {
        unsigned long long p = parts[i];
        if (un >= p) {
            unsigned long long chunk = un / p;
            if (!first) append_fmt(out, out_size, &idx, " ");
            subThousandToWords((int)chunk, out, out_size, &idx);
            append_fmt(out, out_size, &idx, "%s", names[i]);
            un %= p;
            first = 0;
        }
    }
}

int main(void) {
    long long num;
    printf("User Input : ");
    if (scanf("%lld", &num) != 1) {
        printf("Invalid input\n");
        return 1;
    }

    char out[1024];
    numberToWords(num, out, sizeof(out));

    if (out[0] != '\0') {
        if (out[0] >= 'a' && out[0] <= 'z') out[0] = (char)(out[0] - 'a' + 'A');
    }

    printf("Result : %s\n", out);
    return 0;
}
