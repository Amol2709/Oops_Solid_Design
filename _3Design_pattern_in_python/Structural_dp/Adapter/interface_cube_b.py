from abc import ABC, abstractmethod
class ICubeB(ABC):
    "An interface for an object"
    @staticmethod
    @abstractmethod
    def create(top_left_front, bottom_right_back):
        "Manufactures a Cube with coords offset [0, 0,0]"
        pass