package org.example.`Lesson 2`

fun main() {
    val countOfWorkers = 50
    val workersSalary = 30000
    val countOfTrainees = 30
    val traineesSalary = 20000
    val expencesOnWorkersSalary = countOfWorkers * workersSalary
    println(expencesOnWorkersSalary)
    val expencesOnTraineesSalary = countOfTrainees * traineesSalary
    val summonCountOfSalaries = expencesOnWorkersSalary + expencesOnTraineesSalary
    println(summonCountOfSalaries)
    val averageSalaryOfOneWorker = summonCountOfSalaries / 80
    println(averageSalaryOfOneWorker)
}