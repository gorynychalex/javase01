package ru.javalang.module17.p08Adapter;

public class CardReader implements USB{

    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUSBCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
