
    describe("ejercicio 1", () => {

        describe("OK", () => {
            it("numAleatorio", () => {
                let num = numAleatorio(1,100);

                expect(num).toBeGreaterThanOrEquals(1),
                expect(num).toBeLessThanOrEquals(100)
            })
        })

        describe("ko", () => {
            it("falta parámetro", () => {

            })
        })
    })

    describe("ejercicio 2", () => {

    })

    describe("ejercicio 3", () => {

    })