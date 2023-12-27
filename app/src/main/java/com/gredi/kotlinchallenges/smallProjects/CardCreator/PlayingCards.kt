package com.gredi.kotlinchallenges.smallProjects.CardCreator

import com.gredi.kotlinchallenges.smallProjects.CardCreator.playingCards.CardValue
import com.gredi.kotlinchallenges.smallProjects.CardCreator.playingCards.Suit

enum class PlayingCards(val value: CardValue, val suit: Suit) {
    ACE_OF_SPADES(CardValue.ACE, Suit.SPADES),
    TWO_OF_SPADES(CardValue.TWO, Suit.SPADES),
    THREE_OF_SPADES(CardValue.THREE, Suit.SPADES),
    FOUR_OF_SPADES(CardValue.FOUR, Suit.SPADES),
    FIVE_OF_SPADES(CardValue.FIVE, Suit.SPADES),
    SIX_OF_SPADES(CardValue.SIX, Suit.SPADES),
    SEVEN_OF_SPADES(CardValue.SEVEN, Suit.SPADES),
    EIGHT_OF_SPADES(CardValue.EIGHT, Suit.SPADES),
    NINE_OF_SPADES(CardValue.NINE, Suit.SPADES),
    TEN_OF_SPADES(CardValue.TEN, Suit.SPADES),
    JACK_OF_SPADES(CardValue.JACK, Suit.SPADES),
    QUEEN_OF_SPADES(CardValue.QUEEN, Suit.SPADES),
    KING_OF_SPADES(CardValue.KING, Suit.SPADES),

    ACE_OF_HEARTS(CardValue.ACE, Suit.HEARTS),
    TWO_OF_HEARTS(CardValue.TWO, Suit.HEARTS),
    THREE_OF_HEARTS(CardValue.THREE, Suit.HEARTS),
    FOUR_OF_HEARTS(CardValue.FOUR, Suit.HEARTS),
    FIVE_OF_HEARTS(CardValue.FIVE, Suit.HEARTS),
    SIX_OF_HEARTS(CardValue.SIX, Suit.HEARTS),
    SEVEN_OF_HEARTS(CardValue.SEVEN, Suit.HEARTS),
    EIGHT_OF_HEARTS(CardValue.EIGHT, Suit.HEARTS),
    NINE_OF_HEARTS(CardValue.NINE, Suit.HEARTS),
    TEN_OF_HEARTS(CardValue.TEN, Suit.HEARTS),
    JACK_OF_HEARTS(CardValue.JACK, Suit.HEARTS),
    QUEEN_OF_HEARTS(CardValue.QUEEN, Suit.HEARTS),
    KING_OF_HEARTS(CardValue.KING, Suit.HEARTS),

    ACE_OF_CLUBS(CardValue.ACE, Suit.CLUBS),
    TWO_OF_CLUBS(CardValue.TWO, Suit.CLUBS),
    THREE_OF_CLUBS(CardValue.THREE, Suit.CLUBS),
    FOUR_OF_CLUBS(CardValue.FOUR, Suit.CLUBS),
    FIVE_OF_CLUBS(CardValue.FIVE, Suit.CLUBS),
    SIX_OF_CLUBS(CardValue.SIX, Suit.CLUBS),
    SEVEN_OF_CLUBS(CardValue.SEVEN, Suit.CLUBS),
    EIGHT_OF_CLUBS(CardValue.EIGHT, Suit.CLUBS),
    NINE_OF_CLUBS(CardValue.NINE, Suit.CLUBS),
    TEN_OF_CLUBS(CardValue.TEN, Suit.CLUBS),
    JACK_OF_CLUBS(CardValue.JACK, Suit.CLUBS),
    QUEEN_OF_CLUBS(CardValue.QUEEN, Suit.CLUBS),
    KING_OF_CLUBS(CardValue.KING, Suit.CLUBS),

    ACE_OF_DIAMONDS(CardValue.ACE, Suit.DIAMONDS),
    TWO_OF_DIAMONDS(CardValue.TWO, Suit.DIAMONDS),
    THREE_OF_DIAMONDS(CardValue.THREE, Suit.DIAMONDS),
    FOUR_OF_DIAMONDS(CardValue.FOUR, Suit.DIAMONDS),
    FIVE_OF_DIAMONDS(CardValue.FIVE, Suit.DIAMONDS),
    SIX_OF_DIAMONDS(CardValue.SIX, Suit.DIAMONDS),
    SEVEN_OF_DIAMONDS(CardValue.SEVEN, Suit.DIAMONDS),
    EIGHT_OF_DIAMONDS(CardValue.EIGHT, Suit.DIAMONDS),
    NINE_OF_DIAMONDS(CardValue.NINE, Suit.DIAMONDS),
    TEN_OF_DIAMONDS(CardValue.TEN, Suit.DIAMONDS),
    JACK_OF_DIAMONDS(CardValue.JACK, Suit.DIAMONDS),
    QUEEN_OF_DIAMONDS(CardValue.QUEEN, Suit.DIAMONDS),
    KING_OF_DIAMONDS(CardValue.KING, Suit.DIAMONDS),

    JOKER(CardValue.JOKER, Suit.JOKER)
}